package com.springmvc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springmvc.beans.DaoTao;
import com.springmvc.dao.DaoTaoDao;

@Controller
@RequestMapping("/daotao")
public class DaoTaoController {

    @Autowired
    DaoTaoDao daoTaoDao;
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    // Hiển thị danh sách đào tạo
    @RequestMapping("/list")
    public String listDaoTao(Model model) {
        List<DaoTao> list = daoTaoDao.getAllDaoTao();
        model.addAttribute("listDaoTao", list);
        return "daotao/list";
    }

    // Hiển thị form thêm khóa học
    @RequestMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("daotao", new DaoTao());
        return "daotao/add";
    }

    // Xử lý thêm khóa học
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveDaoTao(@ModelAttribute("daotao") DaoTao daotao) {
        daoTaoDao.save(daotao);
        return "redirect:/daotao/list";
    }

    // Hiển thị form sửa khóa học
    @RequestMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        DaoTao daotao = daoTaoDao.getDaoTaoById(id);
        model.addAttribute("daotao", daotao);
        return "daotao/edit";
    }

    // Xử lý cập nhật khóa học
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateDaoTao(@ModelAttribute("daotao") DaoTao daotao) {
        daoTaoDao.update(daotao);
        return "redirect:/daotao/list";
    }

    // Xóa khóa học
    @RequestMapping("/delete/{id}")
    public String deleteDaoTao(@PathVariable int id) {
        daoTaoDao.delete(id);
        return "redirect:/daotao/list";
    }
}
