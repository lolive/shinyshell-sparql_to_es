if (ctx._source.containsKey("rdfslabel")) { ctx._source.rdfslabel += dataToAppend } else { ctx._source.rdfslabel = [ dataToAppend ] }
