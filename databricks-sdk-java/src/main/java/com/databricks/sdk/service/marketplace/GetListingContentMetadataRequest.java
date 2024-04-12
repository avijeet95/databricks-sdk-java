// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get listing content metadata */
@Generated
public class GetListingContentMetadataRequest {
  /** */
  private String listingId;

  /** */
  @QueryParam("page_size")
  private Long pageSize;

  /** */
  @QueryParam("page_token")
  private String pageToken;

  public GetListingContentMetadataRequest setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public GetListingContentMetadataRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public GetListingContentMetadataRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetListingContentMetadataRequest that = (GetListingContentMetadataRequest) o;
    return Objects.equals(listingId, that.listingId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingId, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetListingContentMetadataRequest.class)
        .add("listingId", listingId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
