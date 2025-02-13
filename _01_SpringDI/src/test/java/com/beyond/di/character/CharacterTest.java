package com.beyond.di.character;


import com.beyond.di.config.RootConfig;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
// @ContextConfiguration(locations = "classpath:spring/root-context.xml")
@ContextConfiguration(classes = RootConfig.class)
class CharacterTest {
    @Autowired(required = false)
    private Character character;

    @Value("${db.driver:not found}")
    private String driver;

    @Value("${db.url:not found}")
    private String url;

    @Test
    @Disabled
    void nothing() {
    }

    @Test
    void create() {
        System.out.println(character);

        assertThat(character).isNotNull();
        assertThat(character.getLevel()).isGreaterThan(0);
        assertThat(character.getWeapon()).isNotNull();
    }

    @Test
    void propertyTest() {
        System.out.println(driver + ", " + url);

        assertThat(driver).isEqualTo("org.mariadb.jdbc.driver");
        assertThat(url).isEqualTo("jdbc:mariadb://localhost:3306/web");
    }

}