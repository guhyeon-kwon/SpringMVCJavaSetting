package kr.co.springtest.controller;

import kr.co.springtest.beans.RestDataBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
// RestController가 붙은 컨트롤러는 리턴값을 그대로 반환한다.
public class RestTestController {
    @GetMapping("/test2")
    public ResponseEntity<ArrayList<RestDataBean>> test2(){

        RestDataBean bean1 = new RestDataBean("문자열1", 100, 11.11, false);
        RestDataBean bean2 = new RestDataBean("문자열2", 200, 21.11, true);
        RestDataBean bean3 = new RestDataBean("문자열3", 300, 31.11, false);

        ArrayList<RestDataBean> list = new ArrayList<RestDataBean>();
        list.add(bean1);
        list.add(bean2);
        list.add(bean3);

        ResponseEntity<ArrayList<RestDataBean>> entry = new ResponseEntity<ArrayList<RestDataBean>>(list, HttpStatus.OK);

        return entry;
    }
}
