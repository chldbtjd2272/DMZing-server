package com.walkd.dmzing.dto.course;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class CourseDetailDto {

    private Long id;
    private String title;
    private String mainDescription;
    private String subDescription;
    private String imageUrl;
    private String lineImageUrl;
    private String level;
    private Double estimatedTime;
    private Long price;

    private List<PlaceDto> places;
    private Long reviewCount;
}