package cn.hallie.hframe.common.constant;

/**
 * @author Hallie
 * @date 2024-01-12
 */
public interface Constant {
    /**
     * 逻辑删除为 false 表示未删除 0
     */
    Integer LOGICAL_DEL_FALSE = 0;

    /**
     * 逻辑删除为 true 表示已逻辑删除，不是真的删除 1
     */
    Integer LOGICAL_DEL_TRUE = 1;
}
