package com.suger.api.resources.product;

import com.suger.api.resources.product.requests.SharedUpdateProductParams;
import com.suger.api.types.ListProductsByPartnerRequestPartner;
import com.suger.api.types.SharedAwsSaasProductDimension;
import com.suger.api.types.SharedWorkloadProduct;
import java.lang.String;
import java.util.List;

public interface ProductClient {
  List<SharedWorkloadProduct> listProductsByPartner(String orgId,
      ListProductsByPartnerRequestPartner partner);

  List<SharedWorkloadProduct> listProductsByOrganization(String orgId);

  SharedWorkloadProduct getProduct(String orgId, String productId);

  SharedWorkloadProduct updateProduct(String orgId, String productId,
      SharedUpdateProductParams request);

  String deleteProduct(String orgId, String productId);

  List<SharedAwsSaasProductDimension> listProductMeteringDimensions(String orgId, String productId);
}
