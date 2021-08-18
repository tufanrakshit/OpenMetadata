# JSON Schema

We use [JSON schema](https://json-schema.org/) as the Schema Definition Language as it offers several advantages:

* Easy to describe the structure and semantics of metadata models with readable documentation that is both human and machine consumable.
* Can develop common data types once and reuse as building blocks in other schemas.
* Models can include structural validation, including: required and optional fields, default values, allowed values, regular expressions that not only serve as automated testing and validation but also as documentation of an API contract.
* A rich set of existing tools for JSON schema, including support for generating code and validation from JSON schema in various languages, reducing the manual boilerplate coding.
* Support for converting rich formats \(e.g., URI, date, time\) into native standard types during code generation.

## Reference

1. [JSON schema](https://json-schema.org/) specification version [Draft-07 to 2019-099](https://json-schema.org/draft/2019-09/release-notes.html)
2. [JSON schema 2 POJO](https://www.jsonschema2pojo.org/) tool used for Java code generation from JSON schema
3. [Data model code generator](https://github.com/koxudaxi/datamodel-code-generator) for generating python code from JSON schema

