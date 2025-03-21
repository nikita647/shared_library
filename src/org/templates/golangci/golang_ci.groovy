package org.templates.golang_ci

import org.common.*
import org.golang.*

def call(String branch = 'main', String repoUrl, String gitPassword='' ){
clean = new cleanworkspace()
clone = new gitClone()
compilation = new code_compilation()

clean.call()
clone.call(branch,repoUrl,gitPassword)
compilation.call()
  
}

  
