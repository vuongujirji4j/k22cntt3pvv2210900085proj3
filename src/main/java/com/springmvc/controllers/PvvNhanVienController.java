package com.springmvc.controllers;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.springmvc.beans.PvvNhanVien;
import com.springmvc.beans.MenuItem;
import com.springmvc.dao.PvvNhanVienDao;

@Controller
public class PvvNhanVienController {
	 @InitBinder
	    public void initBinder(WebDataBinder binder) {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        dateFormat.setLenient(false);
	        binder.registerCustomEditor(Date.class, new org.springframework.beans.propertyeditors.CustomDateEditor(dateFormat, true));
	    }


    @Autowired  
    private PvvNhanVienDao dao; // Inject dao từ file cấu hình XML hoặc Annotation-based config

    // Hiển thị form thêm nhân viên mới
    @GetMapping("/nhanvien/form")
    public String showForm(Model m) {
        m.addAttribute("command", new PvvNhanVien());
        return "saveview";
    }

    // Lưu nhân viên mới vào database
    @PostMapping("/nhanvien/save")
    public String save(@ModelAttribute("nhanVien") PvvNhanVien nhanVien) {
        dao.save(nhanVien);
        return "redirect:/nhanvien/view"; // Chuyển hướng đến danh sách nhân viên
    }

    // Hiển thị danh sách nhân viên
    @GetMapping("/nhanvien/view")
    public String viewNhanVien(Model m) {
        List<PvvNhanVien> list = dao.getAllNhanViens();
        m.addAttribute("list", list);
        return "view";
    }

    // Hiển thị form chỉnh sửa thông tin nhân viên
    @GetMapping("/nhanvien/edit/{maNhanVien}")
    public String edit(@PathVariable int maNhanVien, Model m) {
        PvvNhanVien nhanVien = dao.getNhanVienById(maNhanVien);
        m.addAttribute("command", nhanVien);
        return "editview";
    }

    // Lưu chỉnh sửa thông tin nhân viên
    @PostMapping("/nhanvien/editsave")
    public String editSave(@ModelAttribute("nhanVien") PvvNhanVien nhanVien) {
        dao.update(nhanVien);
        return "redirect:/nhanvien/view";
    }

    // Xóa nhân viên theo ID
    @GetMapping("/nhanvien/delete/{maNhanVien}")
    public String delete(@PathVariable int maNhanVien) {
        dao.delete(maNhanVien);
        return "redirect:/nhanvien/view";
    }

    // Hiển thị menu
    @GetMapping("/menu")
    public String getMenu(Model model) {
        List<MenuItem> menuItems = Arrays.asList(
            new MenuItem("Trang chủ", "/SpringMVCPagination"),
            new MenuItem("Danh sách nhân viên", "/SpringMVCPagination/nhanvien/view"),
            new MenuItem("Thêm nhân viên mới", "/SpringMVCPagination/nhanvien/form")
        );
        model.addAttribute("menuItems", menuItems);
        return "menu";
    }
}