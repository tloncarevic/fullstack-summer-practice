import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;

@Service
public class FileUploadService {

    private final String uploadDirectory = "http://localhost:5432/CV";

    public String uploadFile(MultipartFile file) {
        if (file.isEmpty()) {
            return "Error: File is empty!";
        }

        try {
            // Create the upload directory if it does not exist
            File directory = new File(uploadDirectory);
            if (!directory.exists()) {
                directory.mkdirs();
            }

            // Get the original file name and build the file path
            String originalFileName = file.getOriginalFilename();
            String filePath = uploadDirectory + File.separator + originalFileName;

            // Save the file to the server
            file.transferTo(new File(filePath));

            return "File uploaded successfully!";
        } catch (IOException e) {
            return "Error occurred while uploading the file: " + e.getMessage();
        }
    }
}
