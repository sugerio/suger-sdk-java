package com.suger.api.resources.operation;

import com.suger.api.resources.operation.requests.ListOperationsRequest;
import com.suger.api.resources.types.SharedOperation;
import java.lang.String;
import java.util.List;

public interface OperationClient {
  List<SharedOperation> listOperations(String orgId, ListOperationsRequest request);
}
