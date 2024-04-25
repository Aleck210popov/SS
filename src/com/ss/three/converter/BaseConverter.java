package com.ss.three.converter;



public class BaseConverter {
    public static double convert(double temperature, UnitsDegree fromUnit, UnitsDegree toUnit) {
        return switch (fromUnit) {
            case CELSIUS -> convertFromCelsius(temperature, toUnit);
            case KELVIN -> convertFromKelvin(temperature, toUnit);
            case FAHRENHEIT -> convertFromFahrenheit(temperature, toUnit);
        };
    }

    private static double convertFromCelsius(double temperature, UnitsDegree toUnit) {
        return switch (toUnit) {
            case CELSIUS -> temperature;
            case KELVIN -> temperature + 273.15;
            case FAHRENHEIT -> temperature * 9 / 5 + 32;
            default -> {
                System.out.println("Неподдерживаемая единица измерения");
                yield Double.NaN;
            }
        };
    }

    private static double convertFromKelvin(double temperature, UnitsDegree toUnit) {
        switch (toUnit) {
            case CELSIUS:
                return temperature - 273.15;
            case KELVIN:
                return temperature;
            case FAHRENHEIT:
                return (temperature - 273.15) * 9 / 5 + 32;
            default:
                System.out.println("Неподдерживаемая единица измерения");
                return Double.NaN;
        }
    }
    private static double convertFromFahrenheit(double temperature, UnitsDegree toUnit) {
        switch (toUnit) {
            case CELSIUS:
                return (temperature - 32) * 5 / 9;
            case KELVIN:
                return (temperature - 32) * 5 / 9 + 273.15;
            case FAHRENHEIT:
                return temperature;
            default:
                System.out.println("Неподдерживаемая единица измерения");
                return Double.NaN;
        }
    }

    public static void startBaseConvert() {
        double temperature = 25.0;

        // Примеры конвертации
        System.out.println(temperature + " градусов по Цельсию равны " + convert(temperature, UnitsDegree.CELSIUS,
                UnitsDegree.KELVIN) + " Кельвинам");
        System.out.println(temperature + " градусов по Цельсию равны " + convert(temperature, UnitsDegree.CELSIUS,
                UnitsDegree.FAHRENHEIT) + " Фаренгейтам");
    }
}
