package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MyController {
    @GetMapping("/")
    public String index() {
        return "index"; // Nó sẽ tự tìm file index.html ở bước trên
    }

    @GetMapping("/massage-tri-lieu")
    public String massageTriLieuPage() {
        return "massage-tri-lieu"; // Tên file HTML vừa tạo (không cần .html)
    }

    @GetMapping("/ve-chung-toi")
    public String veChungToiPage() {
        return "ve-chung-toi"; // Trả về file ve-chung-toi.html
    }

    @GetMapping("/bai-massage-ten-tuoi")
    public String baiMassageTenTuoiPage() {
        return "bai-massage-ten-tuoi"; // Trả về file bai-massage-ten-tuoi.html
    }

    @GetMapping("/video-khach-hang")
    public String videoKhachHangPage() {
        return "video-khach-hang"; // Trả về file video-khach-hang.html
    }

    @GetMapping("/massage-combo")
    public String massageComboPage() {
        return "massage-combo"; // Trả về file massage-combo.html
    }

    @GetMapping("/tri-lieu")
    public String triLieuPage() {
        return "tri-lieu"; // Tên file tri-lieu.html
    }
}
