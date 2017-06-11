package com.keeptrack.rest.api.keeptrackapi.repository;

import com.keeptrack.rest.api.keeptrackapi.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ria on 5/28/2017.
 */

public interface NoteRepo extends JpaRepository<Note, Long>
{

}
