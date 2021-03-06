package top.ezttf.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author yuwen
 * @date 2019/1/20
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanGetRequest {

    private Long userId;

    private List<Long> idList;

    public boolean validate() {
        return userId != null && ! CollectionUtils.isEmpty(idList);
    }
}
