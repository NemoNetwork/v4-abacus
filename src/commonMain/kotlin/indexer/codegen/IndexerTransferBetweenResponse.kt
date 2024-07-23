/**
 * Indexer API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package indexer.codegen

import kotlinx.serialization.Serializable

/**
 *
 * @param pageSize
 * @param totalResults
 * @param offset
 * @param transfersSubset
 * @param totalNetTransfers
 */
@Serializable
data class IndexerTransferBetweenResponse(

    val pageSize: kotlin.Int? = null,
    val totalResults: kotlin.Int? = null,
    val offset: kotlin.Int? = null,
    val transfersSubset: kotlin.Array<IndexerTransferResponseObject>? = null,
    val totalNetTransfers: kotlin.String? = null
)