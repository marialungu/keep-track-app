package com.keeptrack.rest.api.keeptrackapi.repository;

import com.keeptrack.rest.api.keeptrackapi.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Ria on 5/28/2017.
 */

public interface BoardRepo extends JpaRepository<Board, Long>
{

}
