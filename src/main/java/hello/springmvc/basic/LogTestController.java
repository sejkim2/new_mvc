package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j  //Logger log 를 lombok이 간단히 올려줌
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());  //현재 클래스 가져오기

    @RequestMapping("log-test")
    public String logTest() {
        String name = "Spring";

        //name = Spring
        System.out.println("name = " + name);

//        log.trace("trace log=" + name);    ->  문자열끼리 불필요한 연산이 수행되어 cpu 낭비이므로 {} 문법을 꼭 지키기
        log.trace("trace log={}", name);
        log.debug("debuf log={}", name);
        log.info(" info log={}", name); //시간, 스레드, 프로세스 등 더 많은 정보를 얻을 수 있다.
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
