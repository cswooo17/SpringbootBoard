package com.insight.board6.board.dto;

import lombok.Data;

@Data
public class BoardDto {
    private int boardIdx;
    private  String title;
    private String contentsText;
    private int hitCnt;
    private String creatorId;
    private String createdDatetime;
    private String updaterId;
    private String updatedDatetime;


}
