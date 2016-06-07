#!groovy

    // github-organization-plugin jobs are named as 'org/repo/branch'
    tokens = "${env.JOB_NAME}".tokenize('/')
    org = tokens[0]
    repo = tokens[1]
    branch = tokens[2]
    // maybe we have a branch with slash separators?
    println(tokens[2..-1].join('/'))
    println("o: ${org}\nr: ${repo}\nb: ${branch}\ntokens: ${tokens[2..-1].join('/')}");    
