package org.example.Task2822;

public class Picture implements Deletable {

    @Override
    public void delete(String articleId) {
        System.out.println("Pictures are deleted");
    }

}