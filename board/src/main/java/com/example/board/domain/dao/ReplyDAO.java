package com.example.board.domain.dao;

import com.example.board.domain.vo.BoardVO;
import com.example.board.domain.vo.Criteria;
import com.example.board.domain.vo.ReplyVO;
import com.example.board.mapper.ReplyMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
// 분업, 잘게 나눠서 DAO만 나중에 갈아치워도 문제가 없게 하기 위해
public class ReplyDAO {
    private final ReplyMapper replyMapper;
    // 댓글 추가
    public void register(ReplyVO replyVo){
        log.info("register" + replyVo);
        replyMapper.insert(replyVo);
    }

    // 댓글 한 개 조회
    public ReplyVO read(Long replyNumber){
        log.info("read : " + replyNumber);
        return replyMapper.readReply(replyNumber);
    }

    // 댓글 삭제
    public boolean remove(Long replyNumber) {
        log.info("delete" + replyNumber);
        return replyMapper.delete(replyNumber) == 1;
    }

    //댓글 수정
    public boolean modify(ReplyVO replyVO){
        log.info("modify : " + replyVO);
        return replyMapper.update(replyVO) == 1;
    }

    //댓글 목록
    public List<ReplyVO> getList(Criteria criteria, Long boardBno){
        log.info("getList" + criteria);
        log.info("getList" + boardBno);
        return replyMapper.getList(criteria, boardBno);
    }

    // 댓글 개수
    public int getTotal(Long boardBno){
        return replyMapper.getTotal(boardBno);
    }
}
