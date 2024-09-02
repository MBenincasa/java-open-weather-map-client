package io.github.mbenincasa.javaopenweathermapclient.request.common;

public enum Lang {
    ALBANIAN("sq"),
    AFRIKAANS("af"),
    ARABIC("ar"),
    AZERBAIJANI("az"),
    BASQUE("eu"),
    BELARUSIAN("be"),
    BULGARIAN("bg"),
    CATALAN("ca"),
    CHINESE_SIMPLIFIED("zh_cn"),
    CHINESE_TRADITIONAL("zh_tw"),
    CROATIAN("hr"),
    CZECH("cz"),
    DANISH("da"),
    DUTCH("nl"),
    ENGLISH("en"),
    FINNISH("fi"),
    FRENCH("fr"),
    GALICIAN("gl"),
    GERMAN("de"),
    GREEK("el"),
    HEBREW("he"),
    HINDI("hi"),
    HUNGARIAN("hu"),
    ICELANDIC("is"),
    INDONESIAN("id"),
    ITALIAN("it"),
    JAPANESE("ja"),
    KOREAN("kr"),
    KURMANJI("ku"),
    LATVIAN("la"),
    LITHUANIAN("lt"),
    MACEDONIAN("mk"),
    NORWEGIAN("no"),
    PERSIAN("fa"),
    POLISH("pl"),
    PORTUGUESE("pt"),
    PORTUGUESE_BRAZIL("pt_br"),
    ROMANIAN("ro"),
    RUSSIAN("ru"),
    SERBIAN("sr"),
    SLOVAK("sk"),
    SLOVENIAN("sl"),
    SPANISH("es"),
    SWEDISH("se"),
    THAI("th"),
    TURKISH("tr"),
    UKRAINIAN("ua"),
    VIETNAMESE("vi"),
    ZULU("zu");

    private final String value;

    Lang(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
