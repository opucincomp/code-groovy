def example1() {
  println 'Hello from example1'
  def sout = new StringBuffer(), serr = new StringBuffer()
// 1) 
  def proc ='ls -lrt'.execute()

  proc.consumeProcessOutput(sout, serr)
  proc.waitForOrKill(1000)
  return sout.tokenize()
}

def example2() {
  println 'Hello from example2'
}



return this