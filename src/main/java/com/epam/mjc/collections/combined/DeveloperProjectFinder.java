package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                result.add(entry.getKey());
            }
        }

        result.sort((project1, project2) -> {
            int lengthComparison = Integer.compare(project2.length(), project1.length());
            return (lengthComparison != 0) ? lengthComparison : project2.compareTo(project1);
        });

        return result;
    }
}
