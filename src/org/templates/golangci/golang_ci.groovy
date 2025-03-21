package org.templates.golang_ci

import org.common.*
import org.golang.*

def call(String branch = 'main', String repoUrl, String gitPassword='' ){
def clean = new cleanworkspace()
def clone = new gitClone()
def compilation = new code_compilation()

clean.call()
clone.call(branch, repoUrl, gitPassword)
compilation.call()
  
}

  
