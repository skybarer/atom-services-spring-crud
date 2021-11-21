package com.inkollu.atom.cassandra.repository;

import java.util.List;
import java.util.UUID;

import com.inkollu.atom.cassandra.model.Tutorial;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepository extends CassandraRepository<Tutorial, UUID> {
    @AllowFiltering
    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);
}
