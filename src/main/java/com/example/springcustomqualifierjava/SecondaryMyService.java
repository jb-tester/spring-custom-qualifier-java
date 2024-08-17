package com.example.springcustomqualifierjava;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

/**
 * *
 * <p>Created by Irina on 8/17/2024.</p>
 * *
 */

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Qualifier("secondaryMyService")
public @interface SecondaryMyService {
}
