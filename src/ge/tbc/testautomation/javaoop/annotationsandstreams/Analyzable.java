package ge.tbc.testautomation.javaoop.annotationsandstreams;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Analyzable {
    @VariableNameAnnotation(name = "Id")
    private int id;

    @VariableNameAnnotation(name = "IsActive")
    private boolean isActive;

    @VariableNameAnnotation(name = "SystemCode")
    private char systemCode;

    @VariableNameAnnotation(name = "TotalBytes")
    private long totalBytes;

    @VariableNameAnnotation(name = "FullName")
    private String fullName;

    @VariableNameAnnotation(name = "CreationDate")
    private LocalDate creationDate;

    @VariableNameAnnotation(name = "Roles")
    private List<String> roles;

    @VariableNameAnnotation(name = "Metadata")
    private Map<String, Object> metadata;

    @VariableNameAnnotation(name = "Buffer")
    private byte[] buffer;

    @VariableNameAnnotation(name = "Coordinates")
    private double[][] coordinates;


    @VariableNameAnnotation
    private double accountBalance;


    @VariableNameAnnotation(name = "CUSTOM_METRIC_LIMIT")
    private Integer retryCount;

    @SuppressWarnings("unused")
     public static void main(String[] args) {
        int unusedInt = 523;
        String unusedString = "UnusedString";

        List<Field> fields = List.of(Analyzable.class.getDeclaredFields());
        Predicate<Field> hasAnnotation = field-> {
          VariableNameAnnotation  annotation = field.getAnnotation(VariableNameAnnotation.class);
          String annotationName = annotation.name();
          String fieldName = field.getName();
          return fieldName.equalsIgnoreCase(annotationName);
        };

        List<Field> matchingAnnotations= fields.stream().filter(hasAnnotation).toList();
        List<Field> nonMatchingAnnotations = fields.stream().filter(hasAnnotation.negate()).toList();

        System.out.println("----------Fields whose names match annotation---------");
        matchingAnnotations.forEach(f-> System.out.println("Field Name :" + f.getName()));

        System.out.println("\n----------Fields whose names DO NOT match annotation---------");
        nonMatchingAnnotations.forEach(f-> System.out.println("Field Name :" + f.getName()));
    }
}
