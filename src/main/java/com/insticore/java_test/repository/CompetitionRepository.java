package com.insticore.java_test.repository;

import com.insticore.java_test.competition.Competition;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompetitionRepository extends MongoRepository<Competition, String> {
}
