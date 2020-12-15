package com.cloud.auth.facade.fegin;

import com.cloud.auth.facade.fegin.client.MessageServiceClient;
import com.cloud.common.utils.ResponseResultValidateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Description: 消息服务feign
 *
 * @author zhuwj
 * @version V1.0
 * @date 2020-12-15
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class MessageFeignService {

    private final MessageServiceClient messageFeignClient;

    public String getVersion(String msg) {
        return ResponseResultValidateUtil.validate(messageFeignClient.getVersion());
    }

}
