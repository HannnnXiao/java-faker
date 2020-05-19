package com.test;

import com.github.javafaker.Country;
import com.github.javafaker.Faker;
import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;

import static org.junit.Assert.assertThat;
/**
 * @author Hanxiao
 * the test that generate Country information
 * */

public class CountryTest {

    Faker f = new Faker();
    Country country = f.country();

    @Test
    public void flag() {
        assertThat(f.country().flag(),matchesRegularExpression("http://flags.fmcdn.net/data/flags/w580/[a-z]+.png"));
    }

    @Test
    public void countryCode2() {
        assertThat(f.country().flag(),matchesRegularExpression("[a-z]+"));
    }

    @Test
    public void countryCode3() {
        assertThat(f.country().flag(),matchesRegularExpression("[a-z]+"));
    }

    @Test
    public void name() {
        assertThat(f.country().flag(),matchesRegularExpression("[A-Za-z]+"));
    }

    @Test
    public void capital() {
        assertThat(f.country().flag(),matchesRegularExpression("[A-Za-z]+"));
    }

    @Test
    public void currency() {
        assertThat(f.country().flag(),matchesRegularExpression("[A-Za-z]+"));
    }

    @Test
    public void currencyCode() {
        assertThat(f.country().flag(),matchesRegularExpression("[A-Z]+"));
    }
}
