package example.day01._2REST;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // 해당 클래스는 Controller 임을 알림 (어노테이션 기능 주입 )
    // 1. 해당 클래스는 spring 컨테이너(메모리) bean(객체) 등록한다. ()  // spring 이 bean(객체)를 대신 생성해준다.
    // 2. spring controller 는 기본적으로 http 서블릿 지원하고 별도로 extends 를 하지 않는다.
public class RestController1 {

    // [1] @RequestMapping : URL mapping (요청 URL)
       // -1 . value 속성에 매핑할 HTTP 주소를 정의한다 . // * http://localhost:8080/day01/"원하는주소"
    @RequestMapping( value= "/day01/doget" , method= RequestMethod.GET) // URL mapping (요청 URL)
    public void doGet() {
        System.out.println("RestController1.doGet()");
    } // f end

    // [2] @RequestMapping : http://localhost:8080/day01/dopost
    @RequestMapping( value= "/day01/dopost" , method= RequestMethod.POST)
    public void doPost() {
        System.out.println("RestController1.doPost()");
    } // f end

    // [3] @RequestMapping : http://localhost:8080/day01/doPut
    @RequestMapping( value= "/day01/doput" , method= RequestMethod.PUT)
    public void doPut() {
        System.out.println("RestController1.doPut()");
    } // f end

    // [4] @RequestMapping : http://localhost:8080/day01/doDelete
    @RequestMapping( value= "/day01/dodelete", method= RequestMethod.DELETE)
    public void doDelete() {
        System.out.println("RestController1.doDelete()");
    } // f end

    // [1-1]
    // @RequestMapping( value= "/day01/doget", method= RequestMethod.GET)
    // vs
    @GetMapping("/day01/doget2")
    public void doGET2() {
        System.out.println("RestController1.doGET2()");
    }// f end
    // [2-1]
    // @RequestMapping( value= "/day01/dopost", method= RequestMethod.POST)
    // vs
    // POSTMapping("/day01/dopost2")
    @PostMapping("/day01/dopost2")
        public void doPost2() {
        System.out.println("RestController1.doPost2()");
    } // f end

    // [3-1]
    // @RequestMapping( value= "/day01/doPut", method= RequestMethod.PUT)
    // vs
    // PutMapping("/day01/doPut2")
    @PutMapping("/day01/doput2")
    public void doPut2() {
        System.out.println("RestController1.doPut2()");
    }
    // [4-1]
    // @RequestMapping( value= "/day01/doDelete", method= RequestMethod.DELETE)
    // vs
    // DeleteMapping("/day01/dodelete2")
    @DeleteMapping("/day01/dodelete2")
    public void doDelete2() {
        System.out.println("RestController1.doDelete2()");
    } // f end


} // c end
