/*
 * Copyright © 2024 Realfuture. All rights reserved.
 *
 * This software is the property of Realfuture and is protected by copyright law.
 * No part of this software may be reproduced, distributed, or transmitted in any form or by any means,
 * including photocopying, recording, or other electronic or mechanical methods, without the prior
 * written permission of the copyright owner.
 */

package com.realfuture.awestream.flink.example.util;

/** The info about the deprecation of DataSet API. */
public class DataSetDeprecationInfo {

    public static final String DATASET_DEPRECATION_INFO =
            "All Flink DataSet APIs are deprecated since Flink 1.18 and will be removed in a future"
                    + " Flink major version. You can still build your application in DataSet, but you should move to"
                    + " either the DataStream and/or Table API. This class is retained for testing purposes."
                    + " See Also: https://cwiki.apache.org/confluence/pages/viewpage.action?pageId=158866741";
}
