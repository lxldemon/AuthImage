package AuthImage.controller;

import AuthImage.util.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    @PostMapping("/file/fileupload")
    private R fileupload(){
        R r = R.ok();
        return r;
    }
}
