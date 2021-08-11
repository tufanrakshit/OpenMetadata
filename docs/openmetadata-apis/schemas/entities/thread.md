# Feed

This schema defines the Thread entity. A Thread is a collection of posts made by the users. The first post that starts a thread is **about a data asset** created by a user. Other users can respond to this post by creating new posts in the thread. Note that bot users can also interact with a thread. A post can contains links that mention Users or other Data Assets.

**$id:** [**https://github.com/open-metadata/OpenMetadata/blob/main/catalog-rest-service/src/main/resources/json/schema/entity/feed/thread.json**](https://github.com/open-metadata/OpenMetadata/blob/main/catalog-rest-service/src/main/resources/json/schema/entity/feed/thread.json)

Type: `object`

## Properties

* **id** `required`
  * Unique identifier that identifies an entity instance.
  * $ref: [../../type/basic.json\#/definitions/uuid](thread.md#....typebasic.jsondefinitionsuuid)
* **href**
  * Link to the resource corresponding to this entity.
  * $ref: [../../type/basic.json\#/definitions/href](thread.md#....typebasic.jsondefinitionshref)
* **threadTs**
  * Timestamp of the when the first post created the thread.
* **about** `required`
  * Data asset about which this thread is created for with format &lt;\#E/{enties}/{entityName}/{field}/{fieldValue}.
  * $ref: [../../type/basic.json\#/definitions/entityLink](thread.md#....typebasic.jsondefinitionsentitylink)
* **addressedTo**
  * User or team this thread is addressed to in format &lt;\#E/{enties}/{entityName}/{field}/{fieldValue}.
  * $ref: [../../type/basic.json\#/definitions/entityLink](thread.md#....typebasic.jsondefinitionsentitylink)
* **posts** `required`
  * Type: `array`
    * **Items**
    * $ref: [\#/definitions/post](thread.md#/definitions/post)

## Types defined in this schema

**post**

* Post within a feed.
* Type: `object`
* **Properties**
  * **message** `required`
    * Message in markdown format. See markdown support for more details.
    * Type: `string`
  * **postTs**
    * Timestamp of the post.
    * Type: `string`
    * String format must be a "date-time"
  * **from** `required`
    * ID of User \(regular user or a bot\) posting the message.
    * $ref: [../../type/basic.json\#/definitions/uuid](thread.md#....typebasic.jsondefinitionsuuid)
