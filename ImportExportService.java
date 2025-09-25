package edu.ccrm.io;

import edu.ccrm.domain.Student;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class ImportExportService {

    // Example import method
    public List<String> importStudentsFromFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return Files.lines(path).collect(Collectors.toList());
    }

    // Example export method
    public void exportStudentsToFile(List<Student> students, String filePath) throws IOException {
        Path path = Paths.get(filePath);
        List<String> lines = students.stream()
                                    .map(Student::toString) // Assuming toString() is well-formatted
                                    .collect(Collectors.toList());
        Files.write(path, lines);
    }

    // Method to create a timestamped backup folder and copy files
    public void backupData(String sourceDir) throws IOException {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HHmmss"));
        Path backupPath = Paths.get("backup", "data_" + timestamp);
        Files.createDirectories(backupPath);
        
        File sourceFolder = new File(sourceDir);
        File[] files = sourceFolder.listFiles();
        
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    Files.copy(file.toPath(), backupPath.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }
        System.out.println("Data backed up to: " + backupPath);
    }
    
    // Recursive utility to get directory size 
    public long getDirectorySize(Path directory) throws IOException {
        AtomicLong size = new AtomicLong(0);
        Files.walk(directory)
             .forEach(path -> {
                 if (!Files.isDirectory(path)) {
                     try {
                         size.addAndGet(Files.size(path));
                     } catch (IOException e) {
                         System.err.println("Error getting file size: " + e.getMessage());
                     }
                 }
             });
        return size.get();
    }
}

