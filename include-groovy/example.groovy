def example1() {
  println 'Hello from example1'
  job("test"){
    step{
      shell('ls -lrt')
    }
  }
}

def example2() {
  println 'Hello from example2'
}



return this