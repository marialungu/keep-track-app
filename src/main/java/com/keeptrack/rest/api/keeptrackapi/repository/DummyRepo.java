package com.keeptrack.rest.api.keeptrackapi.repository;

import com.keeptrack.rest.api.keeptrackapi.entity.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ria on 5/28/2017.
 */

public interface DummyRepo extends JpaRepository<Dummy, String>
{

}
