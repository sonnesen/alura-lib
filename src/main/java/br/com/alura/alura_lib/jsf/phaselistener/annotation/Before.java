package br.com.alura.alura_lib.jsf.phaselistener.annotation;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Qualifier
@Target({ PARAMETER })
@Retention(RUNTIME)
public @interface Before {
}
