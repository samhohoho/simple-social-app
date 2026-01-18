package com.samhoho.simple_social_app.repository;

import com.samhoho.simple_social_app.entity.Post;
import com.samhoho.simple_social_app.entity.PostComment;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void testBatch(int total) {
        for (int i = 0; i < total; i++) {
            PostComment comment = new PostComment();
            comment.setReview("Review");
            Post post = new Post();
            post.setTitle("Post title");
            post.addComment(comment);

            em.persist(post);
        }
    }
}
