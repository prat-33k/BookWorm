package com.bookworm.oopbackend;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository <Book, String> {
}
