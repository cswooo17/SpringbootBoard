package com.insight.board6.board.service;

import com.insight.board6.board.dto.BoardDto;
import java.util.List;

public interface BoardService {
       List<BoardDto> selectBoardList() throws Exception;
}
