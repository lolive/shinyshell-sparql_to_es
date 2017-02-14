This is package sparql_to_es of Shinyshell.

This package contains the following functions:

$ aggregatedata  : "Packs the objects for each given subject. For example: :a :b :c; :a :b :d; becomes :a :b :c,:d."

$ install_es_for_sparql_indexing ES_DIR : ""

$ monitor_loads METADATA_LOAD_DIR : ""

$ retrieve_endpoint_labels ENDPOINT _NAMEDGRAPH : ""

$ retrieve_endpoint_longlats ENDPOINT NAMEDGRAPH : ""

$ retrieve_endpoint_metadata ENDPOINT _NAMEDGRAPH : " Stores in /tmp the metadata of an endpoint (resp endpoint/namedgraph): labels, Note that results are aggregated (cf view_help aggregatedata for more info). Example: retrieve_endpoint_metadata http://dbpedia.datao.net/sparql http://dbpedia.org/ "

$ retrieve_endpoint_sameas ENDPOINT _NAMEDGRAPH : ""

$ retrieve_endpoint_types ENDPOINT _NAMEDGRAPH : ""

$ usv2esUpsert  : ""

