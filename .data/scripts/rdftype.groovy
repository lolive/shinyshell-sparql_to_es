if (ctx._source.containsKey("rdftype")) { ctx._source.rdftype += dataToAppend } else { ctx._source.rdftype = [ dataToAppend ] }
