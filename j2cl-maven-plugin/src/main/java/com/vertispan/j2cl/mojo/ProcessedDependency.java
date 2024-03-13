/*
 * Copyright © 2021 j2cl-maven-plugin authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vertispan.j2cl.mojo;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.project.MavenProject;

final class ProcessedDependency {

    private MavenProject mavenProject;
    private Artifact artifact;

    public ProcessedDependency(MavenProject mavenProject, Artifact artifact) {
        this.mavenProject = mavenProject;
        this.artifact = artifact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProcessedDependency that = (ProcessedDependency) o;

        if (!mavenProject.equals(that.mavenProject)) return false;
        return artifact.equals(that.artifact);
    }

    @Override
    public int hashCode() {
        int result = mavenProject.hashCode();
        result = 31 * result + artifact.hashCode();
        return result;
    }
}
