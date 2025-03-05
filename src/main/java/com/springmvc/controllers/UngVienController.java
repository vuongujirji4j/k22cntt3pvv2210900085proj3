package com.springmvc.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springmvc.beans.UngVien;
import com.springmvc.dao.UngVienDao;

@Controller
@RequestMapping("/ungvien")
public class UngVienController {

    @Autowired
    UngVienDao ungVienDao;

    // Hiển thị danh sách ứng viên
    @RequestMapping("/list")
    public String listUngVien(Model model) {
        List<UngVien> list = ungVienDao.getAllUngVien(); // Lấy dữ liệu từ DB
        model.addAttribute("listUngVien", list); // Đưa dữ liệu lên view
        return "ungvien/list"; // Điều hướng đến list.jsp
    }


    // Hiển thị form thêm ứng viên
    @RequestMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("ungVien", new UngVien());
        return "ungvien/add";
    }

    // Xử lý thêm ứng viên
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUngVien(@ModelAttribute("ungVien") UngVien ungVien) {
        ungVienDao.save(ungVien);
        return "redirect:/ungvien/list";
    }

    // Hiển thị form sửa ứng viên
    @RequestMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        UngVien ungVien = ungVienDao.getUngVienById(id);
        model.addAttribute("ungVien", ungVien);
        return "ungvien/edit";
    }

 // Xử lý cập nhật ứng viên
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUngVien(@ModelAttribute("ungVien") UngVien ungVien) {
        ungVienDao.update(ungVien);
        return "redirect:/ungvien/list";
    }


    // Xóa ứng viên
    @RequestMapping("/delete/{id}")
    public String deleteUngVien(@PathVariable int id) {
        ungVienDao.delete(id);
        return "redirect:/ungvien/list";
    }
}
