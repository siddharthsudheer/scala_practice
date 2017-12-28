package fileSearcher

class FilterChecker(val filter: String) {
  def matches(content: String) = content.contains(filter)

  def findMatchedFiles(iOObject: List[IOObject]) = {
    for(iOObject <- iOObject
        if iOObject.isInstanceOf[FileObject]
        if matches(iOObject.name)
    )
    yield iOObject
  }
}

