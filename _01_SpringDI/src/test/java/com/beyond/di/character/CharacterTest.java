package com.beyond.di.character;


import com.beyond.di.config.RootConfig;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = RootConfig.class)
class CharacterTest {
    @Autowired(required = false)
    private Character character;

    @Test
    @Disabled
    void nothing() {
    }

    @Test
    void create() {
        System.out.println(character);

        assertThat(character).isNotNull();
    }
}