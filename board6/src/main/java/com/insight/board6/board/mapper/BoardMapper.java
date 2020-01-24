package com.insight.board6.board.mapper;

import com.insight.board6.board.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper{
    List<BoardDto> selectBoardList() throws Exception;

}
