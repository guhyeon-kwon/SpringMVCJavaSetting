package kr.co.springtest.controller;

import kr.co.springtest.beans.DataBean;
import kr.co.springtest.database.MapperInterface;
import kr.co.springtest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    MapperInterface mapper1;

    @GetMapping("/input_data")
    public String input_data(){
        return "input_data";
    }

    @PostMapping("/input_pro")
    public String insert_data(DataBean dataBean){
        mapper1.insert_data(dataBean);
        return "input_pro";
    }

    @GetMapping("/read_data")
    public String read_data(Model model){
        List<DataBean> list = mapper1.select_data();
        model.addAttribute("list", list);
        return "read_data";
    }

}
