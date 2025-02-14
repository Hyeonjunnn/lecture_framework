package com.beyond.aop.character;

import com.beyond.aop.weapon.Weapon;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
* properties 파일의 값을 읽어오는 방법
* 
* 1. @PropertySource를 사용하는 방법
*   - Environment 객체를 사용해 properties 파일에 설정된 값을 읽어온다.
*   - 스프링 프로퍼티 플레이스 홀더를 사용해서 properties 파일에 설정된 값을 읽어온다.(${키:기본값})
* 
* 2. @PropertySource를 생략하는 방법
*   - xml 설정 파일을 사용하는 경우에는 <context:property-placeholder /> 요소를 추가한다.
* */
@Data
@Component
public class Character {
    @Value("홍길동")
    private String name;

    @Value("78")
    private int level;

    @Autowired
    // @Qualifier("sword")
    private Weapon weapon;

    public String quest(String questName) {
        // if (true) {
        //     throw new RuntimeException("Quest 수행 중 예외 발생");
        // }

        // System.out.printf("%s 퀘스트를 진행 중..\n", questName);
        return questName + " 퀘스트를 진행 중..";
    }

}